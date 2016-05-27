/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class TreeNode {
    
       Object value;
    TreeNode parent;
    Lista hijos;

    public TreeNode() {
    }

    public TreeNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public TreeNode getParent() {
        return parent;
    }

    public Lista getHijos() {
        return hijos;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void addSon(Object son) {
        TreeNode hijo = new TreeNode(son);
        hijo.setParent(this);
        this.getHijos().push(hijo);
    }

    public Object getLefterSon() {
        return this.getHijos().get(0);
    }

    public Object getRightBrother() {
        TreeNode retorno = new TreeNode();
        int position = parent.getHijos().find(this);
        if (this.hasRightBrother() == true) {
            retorno = (TreeNode) parent.getHijos().get(position + 1);
        }
        return retorno;
    }

    public boolean isParent() {
        boolean retorno;
        if (this.getHijos().getSize() > 0) {
            retorno = true;
        } else {
            retorno = false;
        }

        return retorno;
    }

    public boolean hasRightBrother() {
        boolean retorno = false;
        int position = parent.getHijos().find(this);

        if (this.getParent().getHijos().getSize() > position + 1) {
            retorno = true;
        }

        return retorno;
    }
}
