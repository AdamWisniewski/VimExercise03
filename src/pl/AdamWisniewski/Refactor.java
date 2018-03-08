package pl.AdamWisniewski;

import java.util.HashMap;
import java.util.List;

public class Refactor {

	// convert strings to map or edit database to push HashMap instead of Strings

	public HashMap<String, String> convertMessageToHashMap(<header from MQ>, <message from MQ>) {
		
		List<String> headerFields = header.split("|");
		
		List<String> messageFields = message.split("|");
				
		Map<String, String> messageMap = new HashMap<String, String>();
		
		for (int i = 0; i < messageFields.size(); i++) {
			messageMap.put(headerFields[0], messageFields[0]);
		}
		
		return messageMap;
	}
	

	String message = <message from MQ>;
	String[] messageFields = message.split('|');
	switch(messageFields[0]){
	case "AST":
	case "ASL":
		some_method(messageFields[1].... messageFields[5]);
		break;
	case "AMG":
		someOtherMethod(messageFiels[4], messageFiels[17]);
	case "OMG":
		<long code block>
	....
	default:
		System.out.println("default block");
		}

}
