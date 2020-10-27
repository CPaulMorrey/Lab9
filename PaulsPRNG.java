// PaulsPRNG

import java.util.Calendar;

public class PaulsPRNG {
	
	int getRandomNumber() {
		Calendar c = Calendar.getInstance();		
		Long millisecond = c.getTimeInMillis();		
		StringBuilder value1 = new StringBuilder();
		value1.append( millisecond.toString() );
		value1.reverse();
		String value2 = value1.reverse().toString();
		int value = 0;
		value += (100 * value2.charAt( value2.length() - 3));
		value += (10 * value2.charAt( value2.length() - 2));
		value += (value2.charAt( value2.length() - 1));
		
		while( value > 256 ) {
			value = value / 2;
		}
		
		return value;
	}
/*	
	int getRandomNumber () {
		Calendar c = Calendar.getInstance();		
		Long millisecond = c.getTimeInMillis();		
		int value = millisecond.intValue();
		value %= 255;
		return value;
	}
*/	
}
