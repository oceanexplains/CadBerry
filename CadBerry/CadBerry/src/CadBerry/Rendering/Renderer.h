#pragma once
#include "CadBerry/Core.h"

#include "RendererAPI.h"
#include "Buffer.h"
#include "VertexArray.h"
#include "RenderTarget.h"
#include "Camera.h"
#include "Shader.h"
#include "Texture.h"

#include <glm/glm.hpp>

namespace CDB
{
	class CDBAPI Renderer
	{
	public:
		static void BeginScene(OrthographicCamera& Camera, RenderTarget* Target = nullptr);
		static void BeginScene(RenderTarget* Target = nullptr);
		static void EndScene();

		static void Submit(const VertexArray* vertexArray);
		static void Submit(const VertexArray* vertexArray, const Shader* shader, const glm::mat4& transform = glm::mat4(1.0f));
		
		//Uploads uniforms but assumes the vertex array and shader is already bound
		static void SubmitNoBind(const VertexArray* vertexArray, const Shader* shader, const glm::mat4& transform = glm::mat4(1.0f));

		inline static RendererAPI::API GetAPI() { return RendererAPI::GetAPI(); }
	private:
		static RenderTarget* CurrentTarget;
		static glm::mat4 ProjectionViewMatrix;
	};
}