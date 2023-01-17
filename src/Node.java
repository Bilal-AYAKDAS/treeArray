public class Node {

     String vocablary;
     String mean;
     Node left;
     Node right;

    public Node(String vocablary,String mean){

        this.vocablary = vocablary;
        this.mean = mean;
        this.left    = null;
        this.right   = null;

    }
    public void printMynode(){
        if (this.left!=null){
            System.out.print(this.left.mean+"<---"+this.left.vocablary+"  (");}

        System.out.print(this.vocablary+"--->"+this.mean);

        if (this.right!=null) {
            System.out.print(")  " + this.right.mean + "--->" + this.right.vocablary);}
    }

}
