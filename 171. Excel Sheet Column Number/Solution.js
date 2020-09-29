/**
 * @param {string} s
 * @return {number}
 */

var titleToNumber = function (s) {
    let ans = 0;
    for (let i = 0; i < s.length; i++) {
        let carry = Math.pow(26, i);
        ans += carry * (s.charAt(s.length - 1 - i).charCodeAt() - 'A'.charCodeAt() + 1);
    }
    return ans; 
};
