package pl.AdamWisniewski;

public class Refactor {

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
