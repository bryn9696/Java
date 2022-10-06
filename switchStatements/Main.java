package switchStatements;

public class Main {
  public static void main(String[] args) {
    String role = "Admin";

    switch (role) {
      case "Admin":
        System.out.println("You're an admin");
        break;
      case "Moderator":
        System.out.println("You're a moderator");
        break;
      case "Guest":
        System.out.println("You're a guest");
        break;

      default:
        System.out.println("You're a guest");
    }
  }
}
