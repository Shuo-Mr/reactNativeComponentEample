import { requireNativeComponent } from 'react-native';

// let myTextView = {
//     name: 'MyTextView',
//     propTypes: {
//         text: PropTypes.string,
//         textSize:PropTypes.number,
//         textColor:PropTypes.number,
//         isAlpha:PropTypes.bool,
//     }
// }
let MyTextView = requireNativeComponent('MyTextView');


module.exports = MyTextView;