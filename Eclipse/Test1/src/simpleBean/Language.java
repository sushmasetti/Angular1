package simpleBean;

public class Language {
	
		String language;
		String name;
		public String getLanguage() {
		return language;
		}
		public void setLanguage(String language) {
		this.language = language;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
public String languageComments() {
	if (language.equals("java"))
	{
		return "java" ;
	}
	else if(language.equals("c++"))
	{
		return "c++";
	}
	else
	{
		return "others";	
	}
}
		}


