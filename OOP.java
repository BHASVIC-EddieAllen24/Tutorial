import java.time.LocalDate;

class OOP {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Eddie Allen";
        youngerUser.birthday = LocalDate.parse("2007-12-01");

        User olderUser = new User();
        System.out.printf("%s was born back in %s and he is now %d years old", youngerUser.name, youngerUser.birthday.toString(), youngerUser.age());


        olderUser.name = "Eddie senior";
        olderUser.birthday = LocalDate.parse("1975-12-01");
        System.out.printf("%s was born back in %s and he is now %d years old", olderUser.name, olderUser.birthday.toString(), olderUser.age());
    }

}

