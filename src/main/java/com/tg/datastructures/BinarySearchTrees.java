package com.tg.datastructures;

public class BinarySearchTrees<K extends Comparable, V> {

    private Node<K, V> root;
    private int size;

    BinarySearchTrees() {
        root = null;
        size = 0;
    }

    void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<K, V> node) {
        //L, Root, R
        if(node!=null) {
            inOrderTraversal(node.left);
            System.out.println(node);
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node<K, V> node) {
        //Root, L, R
        if(node!=null) {
            System.out.println(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<K, V> node) {
        //L, R, Root
        if(node!=null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node);
        }
    }

    int size() {
        return size;
    }

    V find(K key) {
        return find(root, key);
    }

    private V find(Node<K, V> node, K key) {
        if (node != null) {
            if (node.key.compareTo(key) == 0) {
                return node.value;
            } else if (node.key.compareTo(key) > 0) {
                return find(node.left, key);
            } else {
                return find(node.right, key);
            }
        }
        return null;
    }

    void delete(K key) {
        if (find(key) != null) size--;
        root = delete(root, key);
    }

    private Node<K, V> delete(Node<K, V> node, K key) {
        if (node != null) {
            if (key.compareTo(node.key) > 0) {
                node.right = delete(node.right, key);
            } else if (key.compareTo(node.key) < 0) {
                node.left = delete(node.left, key);
            } else {
                if (node.left == null && node.right == null) {
                    node = null;
                } else if (node.left == null) {
                    node = node.right;
                } else if (node.right == null) {
                    node = node.left;
                } else {
                    Node<K, V> minRight = node.right.min();

                    node.key = minRight.key;
                    node.value = minRight.value;

                    node.right = delete(node.right, node.key);
                }
            }
        }
        return node;
    }

    void insert(K key, V value) {
        if (find(key) == null) size++;
        root = insert(root, key, value);
    }

    private Node<K, V> insert(Node<K, V> node, K key, V value) {
        if (node == null) {
            node = new Node<>(key, value);
        } else if (node.key.compareTo(key) > 0) {
            node.left = insert(node.left, key, value);
        } else if (node.key.compareTo(key) < 0) {
            node.right = insert(node.right, key, value);
        }
        return node;
    }

    private class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> right, left;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node<K, V> min() {
            if (left == null)
                return this;
            else return left.min();
        }

        public Node<K, V> max() {
            if (right == null)
                return this;
            else return right.max();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", right=" + right +
                    ", left=" + left +
                    '}';
        }
    }

}
