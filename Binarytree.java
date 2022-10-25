import java.util.*;
class Binarytree{
    static class Node{
         int data;
         Node left;
         Node right;
        Node(int dd){
            this.data=dd;
            this.left=null;
            this.right=null;
        }
    }



    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int [] nodes){
            idx++;
            if(nodes[idx] == -1 ){
                return null;
            }

            Node nen = new Node(nodes[idx]);
            nen.left=buildtree(nodes);
            nen.right = buildtree(nodes);

            return nen;
        }
        
       
    }
    public static void PrintLevlWise(Node Root){
        if(Root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(Root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }

    }

    public static void inOrder(Node root){
        if(root==null)
        return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postOrder(Node ro){
        if(ro==null){
            return;
        }
        postOrder(ro.left);
        postOrder(ro.right);
        System.out.print(ro.data+" ");


    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String [] args){
        BinaryTree obj = new BinaryTree();

        int n[] = {1,2,4,-1,-1,5,-1,-1,3,-1,7,-1,-1};

        Node root = obj.buildtree(n);

        System.out.println(root.data);

        preorder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        PrintLevlWise(root);

        
    }
}