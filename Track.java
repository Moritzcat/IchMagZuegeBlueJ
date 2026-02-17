/**
 * Beschreiben Sie hier die Klasse Track.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Track
{
    public int numberOfConnections;
    public ConnectionPoint[] connections;
    public double [][] distBeweenCons; //[From][To]
    Track(int numberOfConnections){
        distBeweenCons=new double[numberOfConnections][numberOfConnections];
        connections = new ConnectionPoint[numberOfConnections];
        
        for (int from = 1; from <numberOfConnections; from++) {
            for (int to = 1; to <numberOfConnections; to++) {
                distBeweenCons[from][to]=-1;
            }
        }
        
        //for(double[] distFrom:distBeweenCons){
            //for(double distTo:distFrom){}}
    }
    protected void newDoubleConnection(int c1, int c2, double dist){
                distBeweenCons[c1][c2]=dist;
                distBeweenCons[c2][c1]=dist;
    }
}