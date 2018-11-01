
# react-native-kyc-library

## Getting started

`$ npm install react-native-kyc-library --save`

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNKycLibrary.sln` in `node_modules/react-native-kyc-library/windows/RNKycLibrary.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Kyc.Library.RNKycLibrary;` to the usings at the top of the file
  - Add `new RNKycLibraryPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNKycLibrary from 'react-native-kyc-library';

// TODO: What to do with the module?
RNKycLibrary;
```
  