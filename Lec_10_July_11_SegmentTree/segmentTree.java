package Lec_10_July_11_SegmentTree;

import java.util.Scanner;

public class segmentTree {
    int n;
    int[] sTree;
    int[] arr;

    public segmentTree(int n) {
        Scanner sc = new Scanner(System.in);
        arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sTree = new int[4*n];
    }
    void create(int node, int l, int r){
        if(l == r){
            sTree[node] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        create(2*node, l, mid);
        create(2*node + 1, mid+1, r);

        sTree[node] = sTree[2*node] + sTree[2*node + 1];
    }

    void update(int node, int l, int r, int idx, int val){
        if(l == r){
            arr[idx] += val;
            sTree[node] = arr[l];   // or arr[idx]
            return;
        }
        int mid = (l + r) / 2;
        if(idx >= l && idx <= mid){
            update(2*node, l, mid, idx, val);
        }
        else{
            update(2*node + 1, mid+1, r, idx, val);
        }
        sTree[node] = sTree[2*node] + sTree[2*node + 1];
    }

    int query(int node, int ql, int qr, int sl, int sr){
        if(sr < ql || sl > qr){
            return 0;
        }
        if(sl >= ql && sr <= qr){
            return sTree[node];
        }
        int mid = (sl + sr) / 2;
        int leftans = query(2*node, ql, qr, sl, mid);
        int rightans = query(2*node + 1, ql, qr, mid+1, sr);

        return leftans + rightans;
    }
    public static void main(String[] args) {
        
    }
}
