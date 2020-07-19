package nix.data;

import java.util.AbstractList;
import java.util.Arrays;

public class ForwardLinkedListImpl <T> extends AbstractList {

        Node head; // head of list

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    static class Node {

            String data;
            Node next;

            Node(String d){
                data = d;
                next = null;
            }
        }

        public ForwardLinkedListImpl insert(ForwardLinkedListImpl list, String data){
            Node new_node = new Node(data);
            new_node.next = null;


            if (list.head == null) {
                list.head = new_node;
            }
            else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }

                last.next = new_node;
            }

            return list;
        }

        public void printList(ForwardLinkedListImpl list){
            Node currNode = list.head;

            System.out.print("ForwardLinkedListImpl: ");

            while (currNode != null) {
                System.out.print(currNode.data + " ");

                currNode = currNode.next;
            }
        }

    }


