#pragma once
#include <vector>
//
using namespace std;
//

// CMultilignDoc document

class CMultilignDoc : public CDocument
{
	DECLARE_DYNCREATE(CMultilignDoc)

public:
	CMultilignDoc(bool isRNA=true, char *datapath=NULL, CWinApp *pMainFrame1=NULL, char *startpath1=NULL);
	virtual ~CMultilignDoc();

	char* startpath;//keep track of the path that the user last used to open a file
							//this is saved and restored from the registry
	bool OK;
	CFrameWnd* Frame;
	CWinApp *pMainFrame;
	bool ISRNA;
	char* datapath;

	virtual void OnFinalRelease();

	//filenames holds all the filenames needed for running Multilign
	vector<vector<string> > filenames;
#ifndef _WIN32_WCE
	virtual void Serialize(CArchive& ar);   // overridden for document i/o
#endif
#ifdef _DEBUG
	virtual void AssertValid() const;
#ifndef _WIN32_WCE
	virtual void Dump(CDumpContext& dc) const;
#endif
#endif

protected:
	virtual BOOL OnNewDocument();

	DECLARE_MESSAGE_MAP()
	DECLARE_DISPATCH_MAP()
	DECLARE_INTERFACE_MAP()
};
