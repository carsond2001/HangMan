public enum Parts {

	 NOTHING, HEAD, BODY, ARM1, ARM2,  LEG1, LEG2, EYE1, EYE2 ; 
	
	/**
	 * 
	 * @return returns the next value in Parts or the last item
	 * if at the last item already
	 */
    public Parts next() {
    	if (this!=Parts.EYE2) {
    		return Parts.values()[this.ordinal()+1];   		
    		    	}
    	return Parts.EYE2;
    }
    
    /**
     * 
     * @return returns the first value in Parts
     */
    public static Parts reset() {
    	return Parts.NOTHING;
    }
    
    /**
     * 
     * @param aPart Part being compared
     * @return returns true if this value earlier in Parts than
     * aPart's value
     */
    public boolean lessThan(Parts aPart) {
        return this.compareTo(aPart) < 0;
    }
    
    /**
     * 
     * @param aPart Part being compared
     * @return returns true if this value appears after 
     * aPart's value, false otherwise
     */
    public boolean greaterThan(Parts aPart) {
        return this.compareTo(aPart) > 0;
    }
    
    /**
     * 
     * @param aPart Part being compared
     * @return returns true if this value is the same
     * or appears after 
     * aPart's value, false otherwise
     */
     public boolean greaterEquals(Parts aPart) {
        return this.compareTo(aPart) >= 0;
    }
}