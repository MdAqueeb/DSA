package DSA.Graph.Adjency_Matrix;

public class Dir_Unwe {
    static int[][] graph = new int[0][0];
    public static void main(String args[]){

    }
    static void add_vertex(){
        int[][] new_gr = new int[graph.length+1][graph.length+1];
        for(int i = 0;i < graph.length;i++){
            for(int j = 0;j < graph.length;j++){
                new_gr[i][j] = graph[i][j];
            }
        }
        graph = new_gr;
        return ;
    }
    static void remove_vertex(int v){
        if(v >= graph.length){
            return ;
        }
        int[][] newvert = new int[graph.length-1][graph.length-1];
        for(int i = 0;i < newvert.length;i++){
            for(int j = 0;j < newvert.length;j++){
                if(i < v && j >= v){
                    newvert[i][j] = graph[i][j+1];
                }
                else if(i >= v && j < v){
                    newvert[i][j] = graph[i+1][j];
                }
                else if(i >= v && j >= v){
                    newvert[i][j] = graph[i+1][j+1];
                }
                else{
                    newvert[i][j] = graph[i][j];
                }
            }
        }
        graph = newvert;
        return ;
    }
    static void add_edge(int u,int v){
        // u means source and v means destination
        if(u >= graph.length || v >= graph.length){
            return;
        }
        graph[u][v] = 1;
        return ;
    }
    static void remove_edge(int u,int v){
        if(v >= graph.length || u >= graph.length){
            return ;
        }
        graph[u][v] = 0;
    }
    static boolean check_edge(int u,int v){
        if(v >= graph.length || u >= graph.length){
            return false;
        }
        return graph[u][v] == 1;
    }
    static void all_neighbor_vertex(int v){
        for(int i = 0;i < graph.length;i++){
            if(graph[v][i] == 1){
                System.out.print(i+1);
            }
        }
    }  
    static int no_of_edges(){
        int sum = 0;
        for(int i = 0;i < graph.length;i++){
            for(int j = 0;j < graph.length;j++){
                if(graph[i][j] == 1){
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
