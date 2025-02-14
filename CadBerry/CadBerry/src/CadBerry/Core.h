#pragma once

#ifdef CDB_PLATFORM_WINDOWS
	#ifdef CDB_BUILD_DLL
		#define CDBAPI __declspec(dllexport)
	#else
		#define CDBAPI __declspec(dllimport)
	#endif
#else
	#define CDBAPI 
#endif

#ifdef CDB_ENABLE_ASSERTS
	#define CDB_EditorAssert(x, ...) { if(!(x)) { CDB_EditorError("Assertion failed: {0}", __VA_ARGS__); __debugbreak(); } }
	#define CDB_BuildAssert(x, ...) { if(!(x)) { CDB_BuildError("Assertion failed: {0}", __VA_ARGS__); __debugbreak(); } }
#else
	#define CDB_EditorAssert(x, ...)
	#define CDB_BuildAssert(x, ...)
#endif

#ifdef CDB_PLATFORM_WINDOWS
	#define CDB_MODULE_FUNC __stdcall
#endif
#ifdef CDB_PLATFORM_LINUX
	#define CDB_MODULE_FUNC 
	#define Sleep(amount) sleep(amount)
#endif

#define BIT(x) (1 << x)

//CadBerry version
#define CDB_VersionString "0.1.0"
#define CDB_MajorVersion 0
#define CDB_MinorVersion 1
#define CDB_Fix 0