// Template for this code found at http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBMapper.html
// Class written by Patrick Laflin
// Class written on 4/3/2016

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="UserLogin")
public class UserLoginMapper {
    
    private Integer UserID;
    private String UserName;
    private int UserPassword;
        
    @DynamoDBHashKey(attributeName="UserID")  
    public Integer getUserID() { return UserID;}
    public void setUserID(Integer UserID) {this.UserID = UserID;}
    
    @DynamoDBAttribute(attributeName="User Name")  
    public String getUserName() {return UserName; }
    public void setUserName(String UserName) { this.UserName = UserName; }
    
    @DynamoDBAttribute(attributeName="User Password")  
    public int getUserPassword() { return UserPassword; }
    public void setUserPassword(int UserPassword) { this.UserPassword = UserPassword; }    
}
