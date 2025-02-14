project "CDBRNA"
	kind "SharedLib"
	language "C++"

	targetdir ("bin/" .. OutputDir .. "/%{prj.name}")
    objdir ("bin-int/" .. OutputDir .. "/%{prj.name}")

	files
	{
		"src/**.cpp",
		"src/**.h",
		"include/**.h"
	}

	includedirs
	{
		"src",
		"include",
		"../",
	}

	filter "system:windows"
		cppdialect "C++20"
		staticruntime "Off"
		systemversion "latest"

		postbuildcommands
		{
			("{COPYFILE} %{cfg.buildtarget.relpath} ../../../../bin/" .. OutputDir .. "/Berry"),
			("{COPYFILE} bin/" .. OutputDir .. "/CDBRNA/CDBRNA.pdb ../../../../bin/" .. OutputDir .. "/Berry")
		}

		defines
		{
			"RNA_DLL",
			"CDB_PLATFORM_WINDOWS"
		}

	filter "configurations:Debug"
		defines "CDB_DEBUG"
		runtime "Debug"
		symbols "On"

	filter "configurations:Release"
		defines "CDB_RELEASE"
		runtime "Release"
		optimize "On"
