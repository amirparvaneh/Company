package enums;

public enum DeveloperLanguage {
    JAVA("java"),PYTHON("python"),C_SHARP("C#"),JACASCRIPT("javascript"),C_PLUS_PLUS("c++");
    private String name;
    private DeveloperLanguage(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        
    }

}
