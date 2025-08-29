class Strings {
    public static void main(String[] args) {
        //Example 1:
        //String literalstring1 = "abc";
        //String literalstring2 = "abc";

        //String objectstring1 = new String("xyz");
        //objectstring2 = new String("xyz");

        //System.out.println(literalstring1 == literalstring2);
        //System.out.println(objectstring1 == objectstring2);
        //while the values are visually the same objectstring does not reuse the same value since it creates a new string each time therefore it returns as false

        //Example 2:
        //String name = "Eddie allen"; //%s
        //String City = "Brighton";
        //int age = 17; //%d
        //String college = "Bhasvic";
        //double engine = 2.0; //%f
        //boolean amitellingthetruth = true; //%b
        //String formattedstring = String.format("My name is %s. I am from %s. I am %d years old. I go to %s. My cars engine is a %f. These are all %b claims", name, City, age, college, engine, amitellingthetruth);
        // System.out.println(formattedstring);
        //System.out.println("Hello World I am "+name+". I am from "+City+" and i am "+age+" years old. I go to "+college+".");

        //Example 3:
        //String name = "Eddie Allen";
        //System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());
        //System.out.println(name.length());
        //System.out.println(name.isEmpty());

        //Example 4:
        String string = "The sky is blue.";

        //String updatedString = string.replace("blue", "Red");

        System.out.println(string.contains("sky"));
    }
}
