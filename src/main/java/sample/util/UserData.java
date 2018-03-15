package sample.util;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserData {
//    private MongoDatabase database = DbConnect.getInstance().getDatabase();
//    private MongoCollection userCollection = database.getCollection("user");

    private ObservableList<UserProfile> userProfiles;
    private static UserData instance = new UserData();

    public static UserData getInstance() {
        return instance;
    }

    public ObservableList<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void addUserProfile (UserProfile userProfile){
        userProfiles.add(userProfile);
    }
    public void loadUserProfiles(){
        userProfiles = FXCollections.observableArrayList();
        UserProfile user = new UserProfile("user","user@sample.com","passphrase".getBytes(),"salt".getBytes());
        userProfiles.add(user);

        //
    }
    public void saveUserProfile(){
        //
    }
    public static boolean validateName(String name) {
        String regex = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();

    }
}
