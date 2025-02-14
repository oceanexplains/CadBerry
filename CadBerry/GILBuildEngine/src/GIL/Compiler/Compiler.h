#pragma once
#include <gilpch.h>
#include "GIL/Parser/Region.h"
#include "GIL/Lexer/Token.h"
#include "GIL/Parser/Project.h"

#include "Core.h"
#include "GIL/Parser/AST_Node.h"

namespace GIL
{
	class Sequence;

	namespace Compiler
	{
		GILAPI std::vector<Lexer::Token*> GetTokensInBetween(std::vector<Lexer::Token*>& Tokens, size_t& i, Lexer::LexerToken Begin, Lexer::LexerToken End);
		GILAPI std::vector<Lexer::Token*> GetTokensInBetween(std::vector<Lexer::Token*>& Tokens, int& i, Lexer::LexerToken Begin, Lexer::LexerToken End);
		GILAPI std::map<std::string, Param> GetParams(Parser::Project* Proj, std::vector<Lexer::Token*>& Tokens, int& i, 
			std::vector<std::string>& ParamIdx2Name, std::map<std::string, Param>* Params = nullptr);

		GILAPI std::pair<std::vector<GIL::Parser::Region>, std::string> Compile(GIL::Parser::Project* Proj,
			std::vector<Parser::AST_Node*>* Tokens = nullptr, std::string* Distribution = nullptr);
	}
}