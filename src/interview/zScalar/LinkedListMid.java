package interview.zScalar;

class Node {
    public int value;
    public Node next;
}

class NodeOperation {

    public void addNode(Node[] headNode, int value) {
        Node node = new Node();
        // create new Node
        node.value = value;

        // Store value into node
        node.next = headNode[0];

        // update head to new headNode
        headNode[0] = node;
    }
}

public class LinkedListMid {

    public static void main(String[] args) {
        // Find middle of Linked List
        Node [] headNode = new Node[1];
        NodeOperation nodeOperation = new NodeOperation();
        for(int i=1;i<=5;i++){
            nodeOperation.addNode(headNode, i);
        }

        Node curr =  headNode[0];
        while(curr !=null){
            System.out.println(" Head is" + curr.next + " value is " + curr.value);
            // assign head to new current pointer
            curr = curr.next;
        }
    }

}
