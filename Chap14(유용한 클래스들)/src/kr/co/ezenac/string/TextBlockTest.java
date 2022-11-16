package kr.co.ezenac.string;

public class TextBlockTest {

	public static void main(String[] args) {
		
		String textBlock = """	 	
					This is a typhon
					비가 오늘 꼐속 온다고 합니다.
					내일도..
					기온이 많이 내려가겠죠.
				
				 """;
		
		System.out.println(textBlock);
				
	}
	
	
	
	public static String getTextBlockofHtml() {
		return """
				<html>
					<body>
						<span> Good bye typhon</span>
					</body>
				</html>
		
				""";
		
		
	}
	
}
