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

    public TreeNode getRoot() {
        return root;
    }

    
    public void preorder(TreeNode nodo, Lista retorno) {
         if (nodo == null) {
            nodo = root;
        }

        if (nodo.isParent()) {
            preorder( nodo.getLefterSon(), retorno);
        } else if (nodo.hasRightBrother()) {
            retorno.push(nodo);
            preorder(nodo.getRightBrother(),retorno);
        } else {
            retorno.push(nodo);
            while (nodo.hasRightBrother() == false && nodo != root) {
                if (nodo != root) {
                    nodo = nodo.getParent();
                }
            }

            if (nodo != root) {
                preorder( nodo.getRightBrother(),retorno);
            }
        }
        
    }
    
}
