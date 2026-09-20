//package sorting;
//
//public class sort_7_common_element {
//    static void main(String[] args) {
//
//        public int[] intersection(int[] nums1, int[] nums2) {
//
//            Arrays.sort(nums1);
//            Arrays.sort(nums2);
//
//            ArrayList<Integer> ans = new ArrayList<>();
//
//            int i = 0;
//            int j = 0;
//
//            while (i < nums1.length && j < nums2.length) {
//
//                if (nums1[i] == nums2[j]) {
//                    if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i])
//                        ans.add(nums1[i]);
//                    i++;
//                    j++;
//                }
//                else if (nums1[i] > nums2[j]) {
//                    j++;
//                }
//                else {
//                    i++;
//                }
//            }
//            int[] result = new int[ans.size()];
//
//            for (int k = 0; k < ans.size(); k++) {
//                result[k] = ans.get(k);
//            }
//
//            return result;
//        }
//    }
//}
