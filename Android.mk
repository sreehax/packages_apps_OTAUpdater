LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_USE_AAPT2 := true
LOCAL_MODULE_TAGS := optional
LOCAL_PRIVILEGED_MODULE := true
LOCAL_SRC_FILES := $(call all-java-files-under, src)
LOCAL_PACKAGE_NAME := OTAUpdater
LOCAL_CERTIFICATE := platform
LOCAL_PRIVILEGED_MODULE := true
include $(BUILD_PACKAGE)
include $(CLEAR_VARS)
