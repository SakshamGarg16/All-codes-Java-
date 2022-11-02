import java.util.*;

public class bst {


    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;

        }

    }

    public static Node ad(Node r ,int idx){
        if(r==null){
            r = new Node(idx);
            return r;
        }
        if(r.data>idx){
            r.left=ad(r.left, idx);
        }
        else{
            r.right = ad(r.right, idx);
        }
        return r;
    }

    public static void inOrder(Node r){
        if(r==null){
            return;
        }
        inOrder(r.left);
        System.out.print(r.data+" ");
        inOrder(r.right);
    }

    public static boolean search(Node r , int i){
        if(r==null){
            return false;
        }
        if(r.data==i){
            return true;
        }
        if(r.data>i){
           return search(r.left, i);
        }
        if(r.data<i){
           return search(r.right, i);
        }
        return false;
    }

    public static void root2Leaf(Node r, ArrayList<Integer> Path){
        if(r==null){
            return;
        }
        Path.add(r.data);
        if(r.left==null&&r.right==null){
            System.out.println(Path);
            return;
        }
        else{
            root2Leaf(r.left, Path);
            root2Leaf(r.right, Path);
        }
        Path.remove(Path.size()-1);

    }
    public static void printInRange(Node r , int x , int y){
        if(r==null){
            return;
        }
        if(r.data<=y&&r.data>=x){
            printInRange(r.left, x, y);
            System.out.print(r.data+ " ");
            printInRange(r.right, x, y);
        }
        if(r.data>y){
            printInRange(r.left, x, y);
        }
        if(r.data<x){
            printInRange(r.right, x, y);
        }
    }

    public static Node delete(Node r , int i){
        if(r==null){
            return null;
        }
        if(r.data>i){
            r.left=delete(r.left, i);
        }
        else if(r.data<i){
            r.right = delete(r.right, i);
        }
        else{
            if(r.right==null&&r.left==null){
                return null;
            }
            else if(r.right ==null)
            return r.left;
            else if(r.left==null)
            return r.right;

            Node is = Succ(r.right);
            r.data=is.data;
            r.right=delete(r.right, is.data);
        }
        return r;
    }
    public static Node Succ(Node r){
        while(r.left!=null)
            r=r.left;
        return r;
    }
    public static void main(String args[]){
        Node root =null;
        int a[] = {10,2,4,1,5,1,7,8,9,3,11,44,2,12,-2};

        for(int i=0;i<a.length;i++){
            root=ad(root, a[i]);
        }

        System.out.println(root.data);

        inOrder(root);
        System.out.println("\n");

        System.out.println(search(root, -1));

        root2Leaf(root, new ArrayList<>());

        System.out.println("\n");

        printInRange(root, 1,12);

        delete(root, 11);
        System.out.println("\n");

        inOrder(root);
        System.out.println("\n");

        delete(root, 10);

        inOrder(root);

        delete(root, 1);
        delete(root, 2);
        System.out.println("\n");
        inOrder(root);
    }
    
}
