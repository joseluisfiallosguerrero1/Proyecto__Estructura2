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

    public Object preorder(TreeNode nodo) {
        if(nodo == null){
            nodo = (TreeNode)root.getLefterSon();
        }
        if (nodo.isParent() == true) {
            preorder((TreeNode) nodo.getLefterSon());
            return nodo;
        } else {
            if (nodo.hasRightBrother() == true) {
                preorder((TreeNode) nodo.getRightBrother());
                return nodo;
            } else {
                while (nodo.hasRightBrother() == false) {
                    if (nodo != root) {
                        nodo = nodo.getParent();
                    }
                }

                if (nodo != root) {
                    preorder((TreeNode) nodo.getRightBrother());
                    return nodo;
                }else{
                    return root;
                }
            }
        }
    }
}
