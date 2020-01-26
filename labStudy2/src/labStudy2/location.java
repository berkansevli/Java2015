package labStudy2;


public class location {

//6	Create another class (not in same class add new file) called location 
//that contains two double/float fields namely lat and longi. 
double lat,longi;

//7.Add constructor to class location to set initial values of lat and longi to 41.082266 and to 37.628794 respectively.
public location(){
	lat=41.082266;
	longi=37.628794;
}

//10.1 Add new method moveTreasure(double latt, double longitute) to set lat and longi,

public void moveTreasure(double latt,double longitute) {
	lat=latt;
	longi=longitute;
}

}
