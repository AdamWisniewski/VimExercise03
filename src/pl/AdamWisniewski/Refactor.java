package pl.AdamWisniewski;

import java.util.HashMap;
import java.util.List;

public class Refactor {

	// convert strings to map or edit database to push HashMap instead of Strings

	public HashMap<String, String> convertMessageToHashMap(<header from MQ>, <message from MQ>) {
		
		try {
		List<String> headerFields = header.split("|");
		List<String> messageFields = message.split("|");
		Map<String, String> messageMap = new HashMap<String, String>();
		
		for (int i = 0; i < messageFields.size(); i++) {
			messageMap.put(headerFields[0], messageFields[0]);
		}
		
		return messageMap;
		
		} catch (Exception e) {
			System.out.println("Error while converting message to HashMap");
		}
	}
	
	public void decisionTree(messageMap.get(<messageTitle>) title) {
		try {
				
		switch(title){
		case "AST":
		case "ASL":
			some_method(HashMap<String, String> messageMap);
			break;
		case "AMG":
			someOtherMethod(HashMap<String, String> messageMap);
		case "OMG":
			<long code block>
		....
		default:
			System.out.println("default block");
		} catch (Exception e) {
			
			System.out.println("Error while matching message header");
		}
		
	}
	}	
}
