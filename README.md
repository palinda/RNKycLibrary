
# react-native-kyc-library

## Getting started

`$ npm install --save react-native-kyc-library`

### Mostly automatic installation

`$ react-native link react-native-kyc-library`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-kyc-library` and add `RNKycLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNKycLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNKycLibraryPackage;` to the imports at the top of the file
  - Add `new RNKycLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-kyc-library'
  	project(':react-native-kyc-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-kyc-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-kyc-library')
  	```
### Post Installation Steps

#### Android
1. Append the following lines to `android/settings.gradle`:
  	```
      include ':kycLib-release'
      project(':kycLib-release').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-kyc-library/android/kycLib-release')
  	```
2. Add Java 1.8 compile options to `android/app/build.gradle`
  ```
   compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
  ```
3. Exclude already imported dependancies. Eg: 
  ```
  compile (project(':react-native-kyc-library')) {
        exclude group: 'com.android.support', module: 'support-v4'
        exclude group: 'org.apache.commons', module: 'commons-compress'
    }
  ```

## Usage
```javascript
import RNKycLibrary from 'react-native-kyc-library';

RNKycLibrary.navigateToKYCApp(<Reference ID>, <API Token>);
```
  
Please refer [Sample Project](https://github.com/palinda/RNKycLibrary-Sample)
