package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,7);
        graph.addEdge(5,4);
        graph.addEdge(9,6);
        graph.addEdge(7,9);
        graph.addEdge(9,1);
        graph.addEdge(3,6);
        graph.addEdge(4,6);
        graph.addEdge(2,9);
        graph.addEdge(0,9);


        DepthAndBreadthTraversal bfp = new BreadthFirstPaths(graph, 5);
        System.out.println("Does the path exist? " + bfp.hasPathTo(7));
        System.out.println("Shortest path: " + bfp.pathTo(7));
        System.out.println("Shortest path size - " + bfp.pathTo(7).size());

    }
}
