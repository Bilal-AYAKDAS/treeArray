public class MyHash {


    int T;
    Node[] keys ;

    public MyHash(int t) {
        T = t;

        keys =new Node[T];

    }
    public int hash(Node node){
        int unicodee=0;
        int lenghtofString = node.vocablary.length();
        for (int i=0; i<lenghtofString; i++){
            char character = node.vocablary.charAt(i);
            unicodee += (int) character;
        }

        return unicodee % 29;
    }

    public  void Add(Node newNode){
        int  index = hash(newNode);
        keys[index] = add(keys[index],newNode);

    }
    public Node add(Node root,Node newNode){
        if (root ==null){
            root = newNode;
            return root;
        }else {
            int result = newNode.vocablary.compareTo(root.vocablary);
            if (result < 0) {
                // newNode comes before the previously added node alphabetically.
                root.left = add(root.left, newNode);
                return root;
            } else  {
                // newNode comes later the previously added node alphabetically.
                root.right = add(root.right, newNode);
                return  root;
                 }
            }

        }



    public  void printHash(){
        int i=1;
        for (Node n:keys){
            if (n !=null){
                System.out.print(i++ +". ");
                n.printMynode();
                System.out.println();
            }
        }

    }





}
