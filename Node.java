import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{

// fields for a nodes name, list of hallways attached, whether it has been visited, the previous node and its distance
    private String name;
    private List<Hall> adjacentList;
    private boolean visited;
    private Node predecessor;
    private Integer distance = Integer.MAX_VALUE;

// constructor
    public Node(String name) {
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

// method to add a hallway to the node
    public void addNeighbour(Hall hall) {
        this.adjacentList.add(hall);
    }

// getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hall> getAdjacentList() {
        return adjacentList;
    }

    public void setAdjacentList(List<Hall> adjacentList) {
        this.adjacentList = adjacentList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

// method to get the name of the string
    @Override
    public String toString() {
        return this.name;
    }

// compares wethers this node or another is less than, equal to, or more than
    @Override
    public int compareTo(Node otherNode) {
        return Integer.compare(this.distance, otherNode.getDistance());
    }
}