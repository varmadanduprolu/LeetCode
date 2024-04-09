package com.varma.leetcode.medium;

import java.util.List;

public class Partition_List_86 {
    public static void main(String[] args) {

    }
    public static ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode more=new ListNode(0);
        ListNode lessCurr=less, moreCurr=more;
        while( head!=null){
            if(head.val<x){
                lessCurr.next=head;
                lessCurr=lessCurr.next;
            }
            else{
                moreCurr.next=head;
                moreCurr=moreCurr.next;
            }
            head=head.next;
        }
        lessCurr.next=more.next;
        moreCurr.next=null;
        return less.next;

    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
