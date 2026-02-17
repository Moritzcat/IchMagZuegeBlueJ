
/**
 * Beschreiben Sie hier die Klasse TrackCurve.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TrackCurve extends Track
{
    double r;
    double angle;//in Degr
    public TrackCurve(){
        super(2);
        newDoubleConnection(0,1,r*Math.PI*angle/180);
    
    }


}