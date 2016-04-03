// Template for this code found at http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBMapper.html
// Class written by Patrick Laflin
// Class written on 4/3/2016

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="UserInfo")
public class UserInfoMapper {
    
    private Integer UserID;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String StreetAddressLine1;
    private String StreetAddressLine2;
    private String City;
    private String State;
    private int    ZipCode;
    private String EmailAddress;
    
    @DynamoDBHashKey(attributeName="UserID")  
    public Integer getUserID() { return UserID;}
    public void setUserID(Integer UserID) {this.UserID = UserID;}
    
    @DynamoDBAttribute(attributeName="First Name")  
    public String getFirstName() {return FirstName; }
    public void setFirstName(String FirstName) { this.FirstName = FirstName; }
    
    @DynamoDBAttribute(attributeName="Last Name")  
    public String getLastName() { return LastName; }
    public void setLastName(String LastName) { this.LastName = LastName; }
    
    @DynamoDBAttribute(attributeName = "Phone Number")
    public String getPhoneNumber() { return PhoneNumber; }
    public void setPhoneNumber(String PhoneNumber) { this.PhoneNumber = PhoneNumber; }
    
    @DynamoDBAttribute(attributeName = "Street Address Line 1")
    public String getStreetAddressLine1() { return StreetAddressLine1; }
    public void setStreetAddressLine1(String StreetAddressLine1) { this.StreetAddressLine1 = StreetAddressLine1; }
    
    @DynamoDBAttribute(attributeName = "Street Address Line 2")
    public String getStreetAddressLine2() { return StreetAddressLine2; }
    public void setStreetAddressLine2(String StreetAddressLine2) { this.StreetAddressLine2 = StreetAddressLine2; }
    
    @DynamoDBAttribute(attributeName = "City")
    public String getCity() { return City; }
    public void setCity(String City) { this.City = City; }
    
    @DynamoDBAttribute(attributeName = "State")
    public String getState() { return State; }
    public void setState(String State) { this.State = State; }
    
    @DynamoDBAttribute(attributeName = "Zip Code")
    public int getZipCode() { return ZipCode; }
    public void setZipCode(int ZipCode) { this.ZipCode = ZipCode; }
    
    @DynamoDBAttribute(attributeName = "Email Address")
    public String getEmailAddress() { return EmailAddress; }
    public void setEmailAddress(String EmailAddress) { this.EmailAddress = EmailAddress; }
}
