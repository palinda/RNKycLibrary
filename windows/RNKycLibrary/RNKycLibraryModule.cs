using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Kyc.Library.RNKycLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNKycLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNKycLibraryModule"/>.
        /// </summary>
        internal RNKycLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNKycLibrary";
            }
        }
    }
}
