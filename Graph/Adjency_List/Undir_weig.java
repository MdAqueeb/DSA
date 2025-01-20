package DSA.Graph.Adjency_List;

import java.util.ArrayList;
import java.util.List;

class Node{
    char vertex;
    List<Node> li;
    Node(char vertex){
        this.vertex = vertex;
        li = new ArrayList<>();
        
    }
}
public class Undir_weig {
    static ArrayList<Node> graph  = new ArrayList<>();
    public static void main(String args[]){

    }    
    static void add_vertex(char vertex){
        boolean chk = check_vertex(vertex);
        if(chk == true){
            return ;
        }
        Node vert = new Node(vertex);
        graph.add(vert);
        return;
    }
    static void delete_vertex(char ver){
        boolean chk = check_vertex(ver);
        if(chk == false){
            return;
        }
        Node str = null;
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == ver){
                str = graph.get(i);
                break;
            }
        }

        for(int i = 0;i < str.li.size();i++){
            str.li.get(i).li.remove(str);
        }
        
        graph.remove(str);
        return ;
    }
    static boolean check_vertex(char ver){
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == ver){
                return true;
            }
        }
        return false;
    }
    static void add_edge(char u,char v){
        add_vertex(u);
        add_vertex(v); 
        Node str_u = null;
        Node str_v = null;
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == u){
                str_u = graph.get(i);
            }
            if(graph.get(i).vertex == v){
                str_v = graph.get(i);
            }
        }
        if(str_u == str_v){
            return;
        }
        str_u.li.add(str_v);
        str_v.li.add(str_u);
        return;
    }
    static void remove_edge(char u,char v){
        Node str_u = null;
        Node str_v = null;
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == u){
                str_u = graph.get(i);
            }
            if(graph.get(i).vertex == v){
                str_v = graph.get(i);
            }
        }
        str_u.li.remove(str_v);
        str_v.li.remove(str_u);
        return;
    }
    static void all_neighbor_vertex(char u){
        Node str_u = null;
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == u){
                str_u = graph.get(i);
            }
        }
        for(int j = 0;j < str_u.li.size();j++){
            System.out.print(str_u.li.get(j)+" ");
        }
        return;
    }
    static int no_of_edges(char u){
        Node str_u = null;
        for(int i = 0;i < graph.size();i++){
            if(graph.get(i).vertex == u){
                str_u = graph.get(i);
            }
        }
        int sum = str_u.li.size();
        return sum;
    }
}
