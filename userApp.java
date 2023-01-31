// class User {
//     private String name;
//     private String surname;
//     private String sex;
//     private int age;
//     private String mail;

//     public User(String name, String surname, String sex, int age, String mail) {
//         this.name = name;
//         this.surname = surname;
//         this.sex = sex;
//         this.age = age;
//         this.mail = mail;
//     }
//     String getName() {
//         return this.name;
//     }
//     String getSurname() {
//         return this.surname;
//     }
//     String getSex() {
//         return this.sex;
//     }
//     int getAge() {
//         return this.age;
//     }
//     String getMail() {
//         return this.mail;
//     }
//     public void logIn (){
//     }
//     public void deleteAccount() {
//     }
// }

// class ForumUser extends User {
//     private String userName;
//     private int postsCounter;
//     private boolean logged;

//     public ForumUser(String userName, int postsCounter, boolean logged, String name, String surname, String sex, int age, String mail) {
//         super(name, surname, sex, age, mail);
//         this.userName = userName;
//         this.postsCounter = postsCounter;
//         this.logged = logged;
//     } 
//         public String getUserName() {
//             return this.userName;
//         }
//         public int getPostsCounter() {
//             return this.postsCounter;
//         }
//         public boolean getLogged() {
//             return this.logged;
//         }
//         public void addPost() {
//         }
//         public void commentPost() {
//         }
//         public void userDesc() {
//             System.out.println(userName);
//         }
// }

// class Application {
//     public static void main(String[] args) {
//         ForumUser forumUser = new ForumUser("UserKodilla", 15, true, "Michal", "Zielinski", "male", 29, "zielinskimichal@kodilla.com");
//         int logged = forumUser.getAge();
//         forumUser.userDesc();
//         System.out.println(logged);

//     }
// }