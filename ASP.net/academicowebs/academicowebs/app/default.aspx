<%@ Page Title="" Language="C#" MasterPageFile="~/app/Site1.Master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="academicowebs.app._default" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <h2>Listar las Materias</h2>
    <asp:GridView ID="GridView1" runat="server">
    </asp:GridView>
</asp:Content>
