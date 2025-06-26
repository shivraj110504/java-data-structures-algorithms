package CodeCampus.Lec_05_Strings;

public class shortPath {
    public static float getShortestPath(String str){
        int x = 0, y = 0;
        for(int i = 0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int xSquare = x*x;
        int ySquare = y * y;
        return (float) Math.sqrt(xSquare + ySquare);
    }
    public static void main(String[] args){
        String string = "WNEENESENNN";
        float shortestPath = getShortestPath(string);
        System.out.println("The shortest path is: " + shortestPath);
    }
}
