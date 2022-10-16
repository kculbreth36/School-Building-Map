public class Hall {

// fields to set the length(Weight), starting position and end position of a hallway
    private Integer weight;
    private Node startNode;
    private Node destinationNode;

// constructor
    public Hall(Integer weight, Node startNode, Node destinationNode) {
        this.weight = weight;
        this.startNode = startNode;
        this.destinationNode = destinationNode;
    }


// getters and setters
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getDestinationNode() {
        return destinationNode;
    }

    public void setDestinationNode(Node destinationNode) {
        this.destinationNode = destinationNode;
    }
}