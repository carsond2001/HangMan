
public class StickDraw{
	private Parts part;
	public StickDraw() {
		reset();
	}
	
	public void reset() {
		part = Parts.reset();
		System.out.println("HERE" + part);
	}
	
	public void addBodyPart() {
		part = part.next();
	}
	
	public boolean done() {
		if (part.greaterEquals(Parts.EYE2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void draw() {
		switch(part) {
		case ARM1:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|\r\n"
					+ "-----");
			break;
		case ARM2:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\\\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|\r\n"
					+ "-----");
			break;
		case BODY:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|\r\n"
					+ "-----");
			break;
		case EYE1:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    ( x   )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\\\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|      / \\\r\n"
					+ "-----");
			break;
		case EYE2:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    ( x x )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\\\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|      / \\\r\n"
					+ "-----");
			break;
		case HEAD:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "-----");
			break;
		case LEG1:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\\\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|      / \r\n"
					+ "-----");
			break;
		case LEG2:
			System.out.println("-------\r\n"
					+ "|     -----\r\n"
					+ "|    (     )\r\n"
					+ "|     -----\r\n"
					+ "|      /|\\\r\n"
					+ "|       |\r\n"
					+ "|       |\r\n"
					+ "|      / \\\r\n"
					+ "-----");
			break;
		case NOTHING:
			System.out.println("-------\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "|\r\n"
					+ "-----");
			break;
		default:
			break;
		
		}
	}

}
