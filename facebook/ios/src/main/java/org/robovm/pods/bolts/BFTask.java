/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.bolts;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFTask/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFTaskPtr extends Ptr<BFTask, BFTaskPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFTask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFTask() {}
    protected BFTask(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "result")
    public native NSObject getResult();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "exception")
    public native NSException getException();
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "isFaulted")
    public native boolean isFaulted();
    @Property(selector = "isCompleted")
    public native boolean isCompleted();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "continueWithBlock:")
    public native BFTask continueBlock(@Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithExecutor:withBlock:")
    public native BFTask continueBlock(BFExecutor executor, @Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithSuccessBlock:")
    public native BFTask continueSuccessBlock(@Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithExecutor:withSuccessBlock:")
    public native BFTask continueSuccessBlock(BFExecutor executor, @Block Block1<BFTask, NSObject> block);
    @Method(selector = "waitUntilFinished")
    public native void waitUntilFinished();
    @Method(selector = "taskWithResult:")
    public static native BFTask create(NSObject result);
    @Method(selector = "taskWithError:")
    public static native BFTask create(NSError error);
    @Method(selector = "taskWithException:")
    public static native BFTask create(NSException exception);
    @Method(selector = "cancelledTask")
    public static native BFTask createCancelled();
    @Method(selector = "taskForCompletionOfAllTasks:")
    public static native BFTask createForCompletionOfAllTasks(NSArray<BFTask> tasks);
    @Method(selector = "taskForCompletionOfAllTasksWithResults:")
    public static native BFTask createForCompletionOfAllTasksWithResults(NSArray<BFTask> tasks);
    @Method(selector = "taskWithDelay:")
    public static native BFTask createWithDelay(int millis);
    @Method(selector = "taskFromExecutor:withBlock:")
    public static native BFTask create(BFExecutor executor, @Block Block0<NSObject> block);
    /*</methods>*/
}
