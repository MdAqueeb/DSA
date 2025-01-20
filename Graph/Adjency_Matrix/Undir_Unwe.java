package Adjency_Matrix;

public class Undir_Unwe {
    static int[][] graph = new int[0][0];
    public static void main(String[] args){
    }
    static void add_vertex(){
        
        int[][] newvert = new int[graph.length+1][graph.length+1];
        for(int i = 0;i < graph.length;i++){
            for(int j = 0;j < graph.length;j++){
                newvert[i][j] = graph[i][j];
            }
        }
        graph = newvert;
    }
    static void add_edge(int u,int v){
        if(u >= graph.length || v >= graph.length){
            return;
        }
        graph[u][v] = 1;
        graph[v][u] = 1;
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
    static void remove_edge(int v,int u){
        if(v >= graph.length || u >= graph.length){
            return ;
        }
        graph[v][u] = 0;
        graph[u][v] = 0;
    }
    static boolean check_edge(int v,int u){
        if(v >= graph.length || u >= graph.length){
            return false;
        }
        else if(graph[v][u] == 1){
            return true;
        }
        return false;
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
            for(int j = i+1;j < graph.length;j++){
                if(graph[i][j] == 1){
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
