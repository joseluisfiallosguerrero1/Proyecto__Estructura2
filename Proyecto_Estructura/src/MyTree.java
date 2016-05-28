/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class MyTree {
   TreeNode root;

    public MyTree() {
    }

    public MyTree(TreeNode root) {
        this.root = root;
    }

    public void preorder(TreeNode nodo) {
         if (nodo == null) {
            nodo = root;
        }

        if (nodo.isParent()) {
            System.out.println(nodo.getValue());
            preorder( nodo.getLefterSon());
        } else if (nodo.hasRightBrother()) {
            System.out.println(nodo.getValue());
            preorder(nodo.getRightBrother());
        } else {
            System.out.println(nodo.getValue());
            while (nodo.hasRightBrother() == false && nodo != root) {
                if (nodo != root) {
                    nodo = nodo.getParent();
                }
            }

            if (nodo != root) {
                preorder( nodo.getRightBrother());
            }
        }
    }
    
}
