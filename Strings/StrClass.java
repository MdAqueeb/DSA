package DSA.Strings;

class StrClass {
    private String str;
    public StrClass(String str) {
        this.str = str;
    }

    public int length() {
        return str.length();
    }

    public void concatenate(String anotherStr) {
        this.str = this.str + anotherStr; 
    }

    public String substring(int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public boolean equals(String anotherStr) {
        return str.equals(anotherStr);
    }

    public String toUpperCase() {
        return str.toUpperCase();
    }

    public String toLowerCase() {
        return str.toLowerCase();
    }

    public boolean contains(String subStr) {
        return str.contains(subStr);
    }

    public boolean startsWith(String prefix) {
        return str.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return str.endsWith(suffix);
    }

    public void replace(String oldSubStr, String newSubStr) {
        str = str.replace(oldSubStr, newSubStr);
    }

    public String[] split(String splitchar) {
        return str.split(splitchar);
    }

    public int indexOf(String subStr) {
        return str.indexOf(subStr);
    }

    public String trim() {
        return str.trim();
    }

    public boolean isEmpty() {
        return str.isEmpty();
    }

    public boolean equalsIgnoreCase(String anotherStr) {
        return str.equalsIgnoreCase(anotherStr);
    }

    public static void main(String args[]) {
        StrClass myStr = new StrClass("Hello");

        System.out.println(myStr);
        System.out.println(myStr.length());

        myStr.concatenate(" World");
        System.out.println(myStr);

        System.out.println(myStr.substring(0, 5));
        System.out.println( myStr.charAt(6));

        System.out.println(myStr.contains("World"));
        System.out.println(myStr.startsWith("He"));
        System.out.println(myStr.endsWith("ld"));

        myStr.replace("World", "Java");
        System.out.println( myStr);

        String[] words = myStr.split(" ");
        System.out.println(String.join(", ", words));

        System.out.println( myStr.indexOf("Java"));

        myStr.trim();
        System.out.println(myStr);

        System.out.println( myStr.isEmpty());
        System.out.println(myStr.equalsIgnoreCase("hello"));
    }
}
