package testingData;
//
//public class UserRepositorry {
//    private static volatile UserRepository instance = null;
//
//    private UserRepository() {
//    }
//
//    public static UserRepository get() {
//        if (instance == null) {
//            synchronized (UserRepository.class) {
//                if (instance == null) {
//                    instance = new UserRepository();
//                }
//            }
//        }
//        return instance;
//    }
//
//    public IUser getAdmin() {
//
//        return User.get()
//                .setFirstName("admin")
//                .setLastName("hahaha")
//                .setEmail("hahaha@gmail.com")
//                .setTelephone("telephone_5");
//    }
//}
